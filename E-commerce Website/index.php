<?php
include ('server.php');

// DIV note - They are used to "group" content together and be able to customize the look of that content in a certain way.
// FORM note - They are used to be able to parse / send data that has been entered by the user through input fields. 

// Name should be bigger, and lowered a bit
?>
<html>
    <head>
        <link rel="stylesheet" href = "websiteCSS.css">
    </head>
    <center>
        <body class = "contentPage">
            <div class = "contentBox">
                <form action = 'index.php' method = 'POST' >
                    <h1>Welcome to Icicle Ice Cream</h1>
                    <h2>Email: </h2>
                    <input type = 'text' name = 'userEmail' required >
                    <br>
                    <h2>Password: </h2>
                    <input type = 'password' name = 'userPassword' required >
                    <br>
                    <br>
                    <input type = 'submit' name = 'loginSubmit' value='Login' class="logInButton" >
                    <br>
                </form>
                <a href="forgotPassword.php"><input type = 'submit' name = 'forgotPassword' value='Forgot Password?' class="logInButton"></a>
                <br>
                <br>
                <a href="signUp.php"><input type="submit" value="Sign up" name = "signUp" class = "logInButton"></a>     
            </div>
    </center>
</body>

</html>

<?php
?>


