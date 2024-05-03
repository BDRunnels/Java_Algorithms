const gradeRound = (grades) => {

    return grades.map((grade) => (
            grade >= 38 && grade % 5 >=3 
            ? 
            (grade+5 - (grade%5)) : grade
        )
    );
};

const func = () => {
    console.log("hi");
}
console.log(gradeRound([73,67,38,33]));
func();

// JAVA ANSWER
// public static List<Integer> gradingStudents(List<Integer> grades) {
//     // Write your code here
//         List<Integer> answer = new ArrayList<>();
//         // difference between grade[i] and next multiple of 5 is LESS THAN 3
//             // round grade[i] up to next multiple of 5.
//             // if grade[i] less than 38, no rounding.
        
//         for (int grade : grades) {
//             if (grade >= 38 && grade % 5 >=3) {
//                 answer.add((grade + 5) - (grade%5));
//             } else {
//                 answer.add(grade);
//             }
//         }
//         return answer;
//     }