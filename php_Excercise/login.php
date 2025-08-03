<?php
// Dummy login credentials
$validUsername = "admin";
$validPassword = "1234";

// Get submitted data
$username = $_POST['username'];
$password = $_POST['password'];
?>

<!DOCTYPE html>
<html>
<head>
  <title>Login Result</title>
</head>
<body>

  <?php
  if ($username === $validUsername && $password === $validPassword) {
      echo "<h2>Login Successful</h2>";
      echo "<p>Welcome, <strong>$username</strong>!</p>";
  } else {
      echo "<h2>Login Failed</h2>";
      echo "<p>Invalid username or password.</p>";
  }
  ?>

</body>
</html>