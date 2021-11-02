<?php
include 'dbConnection.php'; // Remove this before officially running the test, this was just used to see if it works
include_once 'server.php';


if (empty($_POST['productSearchText'])) { // not sure if you need to use the button or the textbox to see if it is empty, but we shall find out soon
    $sql = "SELECT prodID, prodName, prodDescription, prodPrice FROM products";
} else {
    $prodSearch = mysqli_real_escape_string($conn, $_POST['productSearchText']);

    $sql = "SELECT prodID, prodName, prodDescription,prodPrice FROM products
            WHERE prodName LIKE '%" . $prodSearch . "'
            OR prodName LIKE '" . $prodSearch . "%'
            OR prodName LIKE '%" . $prodSearch . "%'";
}
// Session id van user...

$result = $conn->query($sql);
$row_count = $result->num_rows;
$count = 0;
if ($row_count != 0) {
    ?>
    <div class="grid-container">
        <?php
        for ($i = 0; $i < ($row_count / 4); $i++) {
            for ($j = 0; $j < 4; $j++) {
                $row = $result->fetch_assoc();

                $count++;
                if ($count > $row_count) {
                    break;
                }
                ?> 
                <div class="resultsPanel">
                    <form action="" method="POST">
                        <?php $prodID = $row['prodID']; ?>
                        <div><img style="width: 50px; height: 50px" src='Images/<?php echo $row['prodName']; ?>.jpg'></div>  
                        <div><?php echo $row['prodName']; // this will be used to display the image that is going to be used? // this will be used to display the products name      ?></div>  
                        <div><b><?php echo $row['prodDescription'] // this will be used to display the products description;  ?></b></div>  
                        <div><?php echo "R " . $row['prodPrice'] // this will be used to display the products price;     ?></div>  
                        <input type="hidden" value="<?php echo $prodID ?>" name="prodID" >
                        <div ><input type="submit" value="Add to cart" name = "addToCart" class = "logInButton"></div>                 
                    </form>
                </div>    
                <?php
            }
            ?>
            <?php
        }
        ?>
    </div>
    <?php
} else {
    ?>
    <h1>No results were found</h1>
    <?php
}
?>



