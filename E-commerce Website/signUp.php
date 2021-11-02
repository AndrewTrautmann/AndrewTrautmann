<?php
include ('server.php');
?>

<html>
    <head>
        <link rel="stylesheet" href = "websiteCSS.css">
    </head>
    <center>
    
    <body class="contentPage">
        <div class="signUpContentBox">
        <form action="signUp.php" method="POST">
            <h1>Sign up</h1>
            <h2>Name: </h2>
            
            <input type = 'text' name = 'signUpUsersName' required >
            <br>
            
            <h2>Surname: </h2>            
            <input type = 'text' name = 'signUpUserSurname' required >
            <br>
            
            <h2>Address: </h2>            
            <input type = 'text' name = 'signUpAddress' required >
            <br>            
            
            <h2>Email address: </h2>
            
            <input type = 'text' name = 'signUpUserEmail' required>
            <br>
            <h2>Contact number: </h2>
            
            <input type = 'text' name = 'signUpUserContactNum' required >
            <br>
                        
            <h2>Password: </h2>
            <input type = 'password' name = 'signUpPassword' required>
            <br>
            <h2>Re-enter password: </h2>
            <input type = 'password' name = 'signUpRePassword' required>
            <br>
            <br>
            <input type = 'submit' name = 'signUpPage' value='Sign up' required class="logInButton" >
        </form>
        
        <a href="index.php"><input type = 'submit' name = 'home' value='Home' class="logInButton" ></a>

        <br>   
        </div>
    </body>
    </center>
</html>
