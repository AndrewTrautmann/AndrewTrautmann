<?php
include ('dbConnection.php');
include ('server.php');
include ('header.php');

$userEmail = $_SESSION['userEmail'];

$query_1 = "SELECT * FROM clients where clientEmail = '$userEmail'";
$result_1 = mysqli_query($conn, $query_1);
$row_count_1 = $result_1->num_rows;
$row = $result_1->fetch_assoc();

$clientID = $row['clientID'];
$clientName = $row['clientName'];
$clientSurname = $row['clientSurname'];
$clientEmail = $row['clientEmail'];
$clientAddress = $row['clientAddress'];
$clientContactNum = $row['clientContactNum'];
$clientPassword = $row['clientPassword'];
?>
<html>
    <head>
        <link rel="stylesheet" href = "">
    </head>
    <center>
    <h1>Your Profile Details</h1>
    <body class="contentPage">
        <div class="">
        <form action="" method="POST">
            <h2>Name: </h2>
            <input type = 'text' name = 'changedUsersName' value='<?php echo $clientName?>' required >
            <br>
            <h2>Surname: </h2>
            
            <input type = 'text' name = 'changedUserSurname' value='<?php echo $clientSurname?>' required >
            <br>
            
            <h2>Address: </h2>
            
            <input type = 'text' name = 'changedAddress' value='<?php echo $clientAddress?>' required >
            <br>
            
            <h2>Email address: </h2>
            
            <input type = 'text' name = 'changedUserEmail' value='<?php echo $clientEmail?>' required>
            <br>
            <h2>Contact number: </h2>
            
            <input type = 'text' name = 'changedUserContactNum' value='<?php echo $clientContactNum?>' required >
            <br>
                        
            <h2>Password: </h2>
            <input type = 'password' name = 'changedPassword' value='<?php echo $clientPassword?>'required>
            <br>
            <h2>Re-enter password: </h2>
            <input type = 'password' name = 'changedRePassword' required>
            <br>
            <br>
            <input type = 'hidden' name = 'userID' value="<?php echo $clientID ?>"  >
            <input type = 'submit' name = 'changeUserInfo' value='Update information' class="logInButton"  >
        </form>
        
            <a href="homeScreen.php"><input type = 'submit' name = 'home' value='Home' class="logInButton" ></a>

        <br>   
        </div>
    </body>
    </center>
</html>



