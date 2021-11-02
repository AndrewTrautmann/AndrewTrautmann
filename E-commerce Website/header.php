<?php
// products.php will be used to show the different types of products that we will have
?>

<html>
    <head>
        <link rel="stylesheet" href = "websiteCSS.css">
    </head>

    <body>
        <div class="topNav">
            <form action="" method="POST">
                <div class="processes">
                    <a href="homeScreen.php" class="link">Products</a>
                    <a href="cart.php" class="link">Cart</a>
                    <!-- <a href="order.php">Orders</a> -->
                    <a href="logOut.php" class="link">Logout</a>
                    <a href="userProfile.php" class="link">Profile</a>
                </div>
                <input type="text" name = "productSearchText" class="searchText" placeholder="Search..">
                <input type="submit" name="productSearch" class="searchBut" placeholder="Search">
            </form>

        </div>
    </body>
</html>