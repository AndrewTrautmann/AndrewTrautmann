<?php

session_start();
include_once 'dbConnection.php';

if (isset($_POST['loginSubmit'])) {

    $userEmail = $_POST['userEmail'];
    $userPass = $_POST['userPassword'];

    $sql = "SELECT * FROM clients WHERE clientEmail = '$userEmail' AND clientPassword = '$userPass'";
    $result = mysqli_query($conn, $sql);
    $rowcount = $result->num_rows;

    if ($rowcount === 1) {
        //$_SESSION['variableName'] = $actualValue
        $_SESSION['userEmail'] = $userEmail;
        //echo"<script>alert('Session email is: ".$_SESSION['userEmail']."!')</script>";
        header('location: homeScreen.php');
    } else {
        echo "<script> 
           
            alert('Invalid Login details, please try again');
            </script>      
            ";
    }
}
if (isset($_POST['signUpPage'])) {

    $userRealName = $_POST['signUpUsersName'];
    $userSurname = $_POST['signUpUserSurname'];
    $userEmail = $_POST['signUpUserEmail'];
    $userAddress = $_POST['signUpAddress'];
    $userContactNum = $_POST['signUpUserContactNum'];
    $userPass = $_POST['signUpPassword'];
    $userRePass = $_POST['signUpRePassword'];

    if (strpos($userEmail, "@") !== false) {
        if ($userRePass == $userPass) {
            $sql = "INSERT INTO clients(clientName, clientSurname, clientAddress, clientEmail, clientContactNum, clientPassword)
                VALUES ('$userRealName','$userSurname','$userAddress','$userEmail','$userContactNum','$userPass')";
            $result = mysqli_query($conn, $sql);
            echo"<script> alert('You have successfully signed up!')</script>";
            //header('location: index.php');
        } else {
            echo"<script> alert('Passwords are not a match, please re-enter the passwords')</script>";
        }
    }else{
        echo"<script> alert('Please enter a valid email address!')</script>";
    }
    //echo"$userRealName.$userSurname.$userEmail.$userContactNum.$userUsername.$userPass";
}
if (isset($_POST['home'])) {
    header('location: index.php');
}
if (isset($_POST['forgetPasswordSubmit'])) {

    $forgotUserEmail = $_POST['forgotPassUserEmail'];
    $forgotUserPass = $_POST['forgotPassword'];
    $userConfirmPass = $_POST['confirmUserForgotPassword'];

    //UPDATE User SET userPassword ='"+ pass + "' " +"WHERE Username ='"+ name +"'");
    if ($userConfirmPass == $forgotUserPass) {
        $sql = "UPDATE clients SET clientPassword = '$forgotUserPass' WHERE clientEmail = '$forgotUserEmail'";
        $result = mysqli_query($conn, $sql);
        echo"<script>alert('You have successfully changed your password!')</script>";
        //header('location: index.php');
    } else {
        echo"<script>alert('Passwords are not a match, please re-enter the passwords!')</script>";
    }
}

if (isset($_POST['addToCart'])) {
    $prodID = $_POST['prodID'];
    $userEmail = $_SESSION['userEmail'];

    $query_1 = "SELECT clientID FROM clients WHERE clientEmail = '$userEmail'";
    $result_1 = mysqli_query($conn, $query_1);
    $row_count = $result_1->num_rows;

    for ($i = 0; $i < $row_count; $i++) {
        $row = $result_1->fetch_assoc();
        $clientID = $row['clientID'];
        $query_2 = "INSERT INTO cart(clientID,prodID)
                VALUES('$clientID','$prodID')";
        $result = mysqli_query($conn, $query_2);
        //$result = mysqli_query($conn, $query_3);script>alert('You have added an item to the cart')</script>";
    }
    echo"<script>alert('You have added an item to the cart')</script>";
}

//        $query_3 = "SELECT * FROM cart"
//                . "JOIN client on cart.clientID = client.clientID"
//                . "WHERE client.clientEmail = '$email'";        


if (isset($_POST['removeCartItems'])) {

    $prodID = $_POST['prodID2'];
    $cartID = $_POST['cartID1'];
    $query_1 = "DELETE FROM cart WHERE cartID ='$cartID'";
    $result = mysqli_query($conn, $query_1);
}

if (isset($_POST['placeOrder'])) {

    //$prodID = $_POST['prodID3']; cant use so would have to create a select statment
    $clientID = $_POST['clientID2'];
    $query_1 = "SELECT * FROM cart 
                JOIN clients ON cart.clientID = clients.clientID
                WHERE clients.clientID = '$clientID'";

    $result_1 = mysqli_query($conn, $query_1);
    $row_count = $result_1->num_rows;

    $query2 = "INSERT INTO orders(clientID)
        VALUES ('$clientID')";
    $result2 = mysqli_query($conn, $query2);

    $query_2 = "SELECT * FROM clients
                JOIN orders ON clients.clientID = orders.clientID
                WHERE clients.clientID = '$clientID'";
    $result_2 = mysqli_query($conn, $query_2);
    $row_count_2 = $result_2->num_rows;
    $row2 = $result_2->fetch_assoc();
    $orderID = $row2['orderID'];

    for ($i = 0; $i < $row_count; $i++) {
        $row = $result_1->fetch_assoc();
        $cartID = $row['cartID'];
        $prodID = $row['prodID'];
        $query3 = "INSERT INTO orders_Products(ordersID,prodID)
                       VALUES ('$orderID','$prodID')";

        $result3 = mysqli_query($conn, $query3);

        $query4 = "DELETE FROM cart WHERE cartID = '$cartID'";
        $result4 = mysqli_query($conn, $query4);
    }
    echo"<script>alert('You have successfully placed an order')</script>";
    header("Location: order.php");
}

if (isset($_POST['changeUserInfo'])) {
    $clientID = $_POST['userID'];
    $userRealName = $_POST['changedUsersName'];
    $userSurname = $_POST['changedUserSurname'];
    $userEmail = $_POST['changedUserEmail'];
    $userAddress = $_POST['changedAddress'];
    $userContactNum = $_POST['changedUserContactNum'];
    $userPass = $_POST['changedPassword'];
    $userRePass = $_POST['changedRePassword'];
    
    if (strpos($userEmail, "@") !== false) {
        if ($userRePass == $userPass) {
            $sql = "UPDATE clients SET clientName = '$userRealName', clientSurname = '$userSurname', clientAddress = '$userAddress', clientEmail = '$userEmail', clientContactNum = '$userContactNum', clientPassword = '$userPass' WHERE clientID = $clientID";
            $result = mysqli_query($conn, $sql);
            echo"<script> alert('You have successfully updated your information!')</script>";
            //header('location: index.php');
        } else {
            echo"<script> alert('Passwords are not a match, please re-enter the passwords')</script>";
        }
    }else{
        echo"<script> alert('Please enter a valid email address!')</script>";
    }
    
}
?>
