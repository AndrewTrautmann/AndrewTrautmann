<?php
include 'dbConnection.php'; // Remove this before officially running the test, this was just used to see if it works
include_once 'server.php';


$userEmail = $_SESSION['userEmail'];
$query_1 = "SELECT * FROM clients WHERE clientEmail = '$userEmail'";
$result_1 = mysqli_query($conn, $query_1);
$row_count_1 = $result_1->num_rows;
$row = $result_1->fetch_assoc();
$clientID = $row['clientID'];


$query_2 = "SELECT clients.clientID, clients.clientEmail,cart.cartID, cart.prodID, products.prodID, products.prodName, products.prodDescription, products.prodPrice  FROM clients
           JOIN cart ON cart.clientID = clients.clientID
           JOIN products ON cart.prodID = products.prodID
           WHERE clients.clientEmail = '$userEmail'";
$result_2 = mysqli_query($conn, $query_2);
$row_count_2 = $result_2->num_rows;

if ($row_count_2 != 0) {
    $totalPrice = 0;
    ?>

    <div class="cartView">
        <?php
        for ($i = 0; $i < $row_count_2; $i++) {
            $row2 = $result_2->fetch_assoc();
            $prodID = $row2['prodID'];
            $cartID = $row2['cartID'];
            ?>
            <div><img style="width: 50px; height: 50px" src='Images/<?php echo $row2['prodName']; ?>.jpg'></div>
            <div ><?php echo $row2['prodName']; ?></div>
            <div><?php echo $row2['prodDescription']; ?></div>
            <div><?php echo "R " . $row2['prodPrice']; ?></div>
            <?php
            $totalPrice = $totalPrice + $row2['prodPrice'];
            // echo $row3['prodType'];
            ?>
            <form action="" method="POST">

                <input type="hidden" value="<?php echo $prodID ?>" name="prodID2" >
                <input type="hidden" value="<?php echo $clientID ?>" name="clientID" >
                <input type="hidden" value="<?php echo $cartID ?>" name="cartID1" >
                <input type="submit" value="Remove" name="removeCartItems" class="removeButton">
                <br>  
            </form>
            <?php
        }
        ?>
    </div>

    <div class="cartPrices">
        <form action="" method="POST">
            <h1>Price: R <?php echo $totalPrice ?></h1>
            <input type="hidden" value="<?php echo $clientID ?>" name="clientID2" >
            <input type="hidden" value="<?php echo $cartID ?>" name="cartID2" >
            <input type="submit" value="Place order" name="placeOrder" class="logInButton">
        </form>
    </div>
    <?php
} else {
    ?>
    <div class="noCartView">
    <h1 class="cartContentBox">No items in cart</h1>
    </div>
    <?php
}
?>

