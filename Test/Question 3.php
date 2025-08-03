<?php

$num1 = 20;
$num2 = 5;
$operator = "*"; 
$result = 0;
$operation_description = ""; 

if ($operator == "+") {
    $result = $num1 + $num2;
    $operation_description = "Addition";
    echo "The result of {$operation_description} of {$num1} and {$num2} is: " . $result;
} elseif ($operator == "-") {
    $result = $num1 - $num2;
    $operation_description = "Subtraction";
    echo "The result of {$operation_description} of {$num1} and {$num2} is: " . $result;
} elseif ($operator == "*") {
    $result = $num1 * $num2;
    $operation_description = "Multiplication";
    echo "The result of {$operation_description} of {$num1} and {$num2} is: " . $result;
} elseif ($operator == "/") {
    if ($num2 != 0) {
        $result = $num1 / $num2;
        $operation_description = "Division";
        echo "The result of {$operation_description} of {$num1} and {$num2} is: " . $result;
    } else {
        echo "Error: Cannot divide by zero!";
    }
} else {
    echo "Error: Invalid operator entered. Please use +, -, *, or /.";
}

?>