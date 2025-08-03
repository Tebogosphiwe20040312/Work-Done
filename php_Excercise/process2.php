<?php
$name = $_POST['username'];
$age = $_POST['age'];
?>

<!DOCTYPE html>
<html>
<head>
  <title>Form Output</title>
  <style>
    body {
      font-family: Arial;
      padding: 20px;
    }
    .message {
      margin-top: 20px;
      color: blue;
      font-size: 18px;
    }
  </style>
</head>
<body>

  <h2>Welcome!</h2>
  <div class="message">
    <?php
      echo "Hello, <strong>$name</strong>!<br>";
      echo "You are <strong>$age</strong> years old.";
    ?>
  </div>

</body>
</html>