<?php
include ('server.php');
?>

<html>
    <head>
        <link rel="stylesheet" href = "websiteCSS.css">
    </head>
    <center>
        
        <body class = "contentPage">
            <div class = "forgotPasswordContentBox">
                <form action="forgotPassword.php" method="POST">
                    <h1>Forgot Password</h1>
                    <h2>Enter your email address: </h2>
                    <input type = 'text' name = 'forgotPassUserEmail'required >
                    <br>        
                    <h2>Enter your new password:</h2>            
                    <input type = 'password' name = 'forgotPassword' required >
                    <br>     
                    <h2>Re-enter password:</h2>
                    <input type = 'password' name = 'confirmUserForgotPassword' required >
                    <br>
                    <br>
                    <input type = 'submit' name = 'forgetPasswordSubmit' value='Submit' class="logInButton" >
                    <br>
                </form>
                <a href="index.php"><input type = 'submit' name = 'home' value='Home' class="logInButton"></a>
            </div>
        </body>
    </center>
</html>
