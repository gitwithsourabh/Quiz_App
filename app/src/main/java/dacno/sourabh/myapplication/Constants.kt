package dacno.sourabh.myapplication

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"


    fun  getQuestion():ArrayList<Question>{
        val questionList =ArrayList<Question>()

        val ques1=Question(
                id = 1 ,  "This is the flag of which Scandinavian country?",
            R.drawable.ic_denmark,  "Swedan","Norway","Denmark","None",1


        )
        questionList.add(ques1)


        val ques2=Question(
            id = 2 ,  "This picture was taken during which historical period?",
            R.drawable.ic_greatdepe,
            optionOne = "The World war 1",
            optionTwo = "The World War 2",
            optionThree = "The Great Depression",
            optionFour = "None of above",
            correctAns = 3
        )
        questionList.add(ques2)

        val ques3=Question(
            id = 3 ,  "What is the name of this world-known tourist destination in Italy?",
            R.drawable.ic_pisa,
            optionOne = "Ponte Vecchio",
            optionTwo = "Leaning Tower of Pisa",
            optionThree = "Milan Cathedral",
            optionFour = "None of above",
            correctAns = 2
        )
        questionList.add(ques3)

        val ques4=Question(
            id = 4 ,  "What is the name of this sport?",
            R.drawable.ic_cricket,
            optionOne = "Cricket",
            optionTwo = "Hockey",
            optionThree = "Football",
            optionFour = "Carrom",
            correctAns = 1
        )
        questionList.add(ques4)

        val ques5=Question(
            id = 5 ,  "From which country did this musical instrument originally come from?",
            R.drawable.ic_spain,
            optionOne = "Spain",
            optionTwo = "France",
            optionThree = "Italy",
            optionFour = "India",
            correctAns = 1
        )
        questionList.add(ques5)
        return questionList
    }
}