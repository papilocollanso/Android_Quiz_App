package com.example.quizapp

object setData {
    const val name:String ="name"
    const val score:String="score"
    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()
        var question1 =QuestionData(
            1,
            "what is the capital of Nigeria",
            "Lagos",
            "Enugu",
            "Abuja",
            "Port Harcourt",
            3
        )
        var question2 =QuestionData(
            2,
            "what is the capital Of Canada",
            "Ontario",
            "British Columbia",
            "Ottawa",
            "Toronto",
            3
        )
        var question3  =QuestionData(
            3,
            "what is the capital of United States of America",
            "Texas",
            "Newyork",
            "Washington",
            "California",
            3
        )
        var question4 =QuestionData(
            4,
            "who is the CEO of Amazon",
            "Prosper Collins",
            "Joe Biden",
            "Jeff Bezos",
            "Anthony Blinken",
            3
        )
        var question5=QuestionData(
            5,
            "what collection is the Superman found",
            "X-Men",
            "Marvel",
            "DC",
            "Avatar",
            3
        )

        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)

        return que
    }
}