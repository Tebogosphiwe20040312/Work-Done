<!DOCTYPE html>
<html>
<head>
    <title>Basic PHP Calculator</title>
    <style>
        body { font-family: Arial, sans-serif; }
        form { margin-top: 20px; padding: 20px; border: 1px solid #ccc; width: 300px; }
        label, input { display: block; margin-bottom: 10px; }
        input[type="text"] { width: 100%; padding: 8px; box-sizing: border-box; }
        input[type="submit"] { padding: 10px 20px; background-color: #007bff; color: white; border: none; cursor: pointer; }
        input[type="submit"]:hover { background-color: #0056b3; }
        .result { margin-top: 20px; font-size: 1.2em; color: green; }
        .error { margin-top: 20px; font-size: 1.2em; color: red; }
    </style>
</head>
<body>

    <h1>Simple PHP Calculator</h1>

    <form method="post" action="">
        <label for="first">First Number:</label>
        <input type="text" id="first" name="first" value="<?php echo isset($_POST['first']) ? htmlspecialchars($_POST['first']) : ''; ?>" required>

        <label for="second">Second Number:</label>
        <input type="text" id="second" name="second" value="<?php echo isset($_POST['second']) ? htmlspecialchars($_POST['second']) : ''; ?>" required>

        <label for="operator">Operator (+, -, *, /):</label>
        <input type="text" id="operator" name="operator" value="<?php echo isset($_POST['operator']) ? htmlspecialchars($_POST['operator']) : ''; ?>" required>

        <input type="submit" name="calculate" value="Calculate">
    </form>

    <?php
    if (isset($_POST['calculate'])) {
        $first_num = $_POST['first'];
        $second_num = $_POST['second'];
        $op = $_POST['operator'];

        if (is_numeric($first_num) && is_numeric($second_num)) {
            $first_num = (float)$first_num;
            $second_num = (float)$second_num;
            $result = 0;
            $error = false;

            switch ($op) {
                case '+':
                    $result = $first_num + $second_num;
                    break;
                case '-':
                    $result = $first_num - $second_num;
                    break;
                case '*':
                    $result = $first_num * $second_num;
                    break;
                case '/':
                    if ($second_num != 0) {
                        $result = $first_num / $second_num;
                    } else {
                        echo "<p class='error'>Error: Division by zero is not allowed!</p>";
                        $error = true;
                    }
                    break;
                default:
                    echo "<p class='error'>Error: Invalid operator. Please use +, -, *, or /.</p>";
                    $error = true;
                    break;
            }

            if (!$error) {
                echo "<p class='result'>Result: " . $first_num . " " . htmlspecialchars($op) . " " . $second_num . " = " . $result . "</p>";
            }

        } else {
            echo "<p class='error'>Error: Please enter valid numbers for calculations.</p>";
        }
    }
    ?>

</body>
</html>