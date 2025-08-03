<?php
// Dummy credentials
$validUsername = "admin";
$validPassword = "1234";

// Get submitted data
$username = $_POST['username'];
$password = $_POST['password'];

// Check login
if ($username === $validUsername && $password === $validPassword) {
    // Login success
    echo "<h2>Login Successful</h2>";
    echo "<p>Welcome, <strong>$username</strong>!</p>";
} else {
    // Redirect back to login with error
    $error = urlencode("Invalid username or password.");
    header("Location: loginphp.php?error=$error");
    exit();
}
?>