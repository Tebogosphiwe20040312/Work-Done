<?php


$student_marks = array("Scott" => 100, "John" => 95, "Lydia" => 90);




foreach ($student_marks as $student_name => $mark) {
    echo $student_name . " = " . $mark . "<br>";
}

$highest_mark = max($student_marks);
$student_with_highest_mark = array_search($highest_mark, $student_marks);


echo "The highest mark recorded for the Web Management test is: " . $highest_mark . "<br>";
echo $student_with_highest_mark . " has the highest mark."

    ?>