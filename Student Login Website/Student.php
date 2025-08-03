<!DOCTYPE html>
<html lang="en">
<head>

    <title>Student Login</title>

</head>
<body style="background: linear-gradient(to top, rgba(255, 149,5,0.8)50%, rgb(255, 149, 5,0.8)50%), url(Koenigsegg.jpg);;width:100%;height:100%;background-size:cover;background-repeat:no-repeat;">
<?php

if (isset($_POST["number"])) {
    $StudentNumber = $_POST["number"];
} else {
    $StudentNumber = "Student number not provided.";
}
if(isset($_POST["email"])) {
    $email= $_POST["email"];
} else {
    $email = "Email not provided.";
}
if(isset($_POST["password"])) {
    $password= $_POST["password"];
} else {
    $password = "Password not provided.";
}
echo '<p style="font-family:Arial;font-size:20px;">' . "Your Student Number : " . $StudentNumber . "</p>";
echo '<p style="font-family:Arial;font-size:20px;">' . "Your email address is: " . $email . "</p>";
echo '<p style="font-family:Arial;font-size:20px;">' . "Your password is: " . $password . "</p>";


?>



</body>
</html>