<?php
include ('dbConnection.php');
include_once 'server.php';

//$userEmail = $_SESSION['userEmail'];
//$query_1 = "SELECT * FROM clients WHERE clientEmail = '$userEmail'";
//$result1 = mysqli_query($conn, $query_1);
//$row = $result1->fetch_assoc();
//$clientID = $row['clientID'];
//
//$query_2 = "SELECT * FROM clients
//            JOIN orders ON clients.clientID = orders.clientID
//            JOIN orders_Products ON orders.orderID = orders_Products.ordersID
//            JOIN products ON products.prodID = orders_Products.prodID
//            WHERE clients.clientID = '$clientID'";
//
//$results_2 = mysqli_query($conn, $query_2);
//$row_count_2 = $results_2->num_rows;
//
//if ($row_count_2 != 0) {
//    for ($i = 0; $i < $row_count_2; $i++) {
//        $row2 = $results_2->fetch_assoc();
//        $orderID = $row2['orderID'];
//        echo "orderID: " . $orderID . "<br>";
//        echo $row2['prodName'] . "<br>";
//        echo $row2['prodDescription'] . " <br>";
//        echo "R " . $row2['prodPrice'] . "<br>";
//    }
//} else {
//    
?>
<!--    <h1>No orders has been made</h1>-->
<html>
    <body class="contentPage">
    <center>
        <h1>Your order has been made! Your products will be delivered to your address within 3 working days. </h1>
        <h1>Please have the necessary amount of money ready on site for when we deliver the products!</h1>
        <h1>Thank you for shopping with Icicle Ice Creams!</h1>
        <h1>Have a great day!</h1>
    </center>
    </body>
</html>

<?php
//}
?>
