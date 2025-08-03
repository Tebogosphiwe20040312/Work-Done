<!DOCTYPE html>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
    <form method="POST">
        <input type="text" name="first" placeholder="Enter first number">
        <input type="text" name="second" placeholder="Enter second number">
        <input type="text" name="operator" placeholder="Enter operator (+, -, *, /)">
        <button type="submit">Calculate</button>
    </form>

    <?php
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            $first_num = $_POST["first"];
            $second_num = $_POST["second"];
            $operator = $_POST["operator"];
            $result = "";

            if ($operator == "+") {
                $result = $first_num + $second_num;
            } elseif ($operator == "-") {
                $result = $first_num - $second_num;
            } elseif ($operator == "*") {
                $result = $first_num * $second_num;
            } elseif ($operator == "/") {
                if ($second_num != 0) {
                    $result = $first_num / $second_num;
                } else {
                    $result = "Error: Division by zero!";
                }
            } else {
                $result = "Invalid Operator!";
            }

            echo "<h2>Result: $result</h2>";
        }
    ?>
</body>
</html>
