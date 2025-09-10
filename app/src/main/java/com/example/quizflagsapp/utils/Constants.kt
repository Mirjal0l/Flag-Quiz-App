package com.example.quizflagsapp.utils

import com.example.quizflagsapp.R
import com.example.quizflagsapp.model.Question

object Constants{

    const val USER_NAME = "user_name"
    const val TOTAL_QUESTIONS = "total_questions"
    const val SCORE = "correct_ansers"

    fun getQuestions() : MutableList<Question> {
        val questions = mutableListOf<Question>()

        val quest1 = Question(
            1, "What country does this flag belong ?", R.drawable.it,
            "Italy", "India", "Iran", "Ireland", 1
        )
        questions.add(quest1)

        val quest2 = Question(
            2, "What country does this flag belong?", R.drawable.ar,
            "Brazil", "Argentina", "Haiti", "Urugvay",2
        )
        questions.add(quest2)

        val quest3 = Question(
            3, "What country does this flag belong?", R.drawable.br,
            "Thailand", "Argentina", "Brazil", "Italy",3
        )
        questions.add(quest3)

        val quest4 = Question(
            4, "What country does this flag belong?", R.drawable.fr,
            "Uzbekistan", "Germany", "Italy", "France",4
        )
        questions.add(quest4)

        val quest5 = Question(
            5, "What country does this flag belong?", R.drawable.ger,
            "Germany", "Argentina", "Brazil", "Italy",1
        )
        questions.add(quest5)

        val quest6 = Question(
            6, "What country does this flag belong?", R.drawable.`in`,
            "Irland", "India", "Tajikistan", "Hungary", 2
        )
        questions.add(quest6)

        val quest7 = Question(
            7, "What country does this flag belong?", R.drawable.ni,
            "Irland", "Argentina", "Nigeria", "France",3
        )
        questions.add(quest7)

        val quest8 = Question(
            8, "What country does this flag belong?", R.drawable.nor,
            "Swizerland", "Finland", "Brazil", "Norway",4
        )
        questions.add(quest8)

        val quest9 = Question(
            9, "What country does this flag belong?", R.drawable.ru,
            "Russia", "France", "Netherland", "Hungary",1
        )
        questions.add(quest9)

        val quest10 = Question(
            10, "What country does this flag belong?", R.drawable.sp,
            "India", "Spain", "Brazil", "United States",2
        )
        questions.add(quest10)

        val quest11 = Question(
            11, "What country does this flag belong?", R.drawable.us,
            "Malaysia", "Haiti", "United States", "Italy",3
        )
        questions.add(quest11)

        val quest12 = Question(
            12, "What country does this flag belong?", R.drawable.uz,
            "Serra-Leone", "United States", "Russia", "Uzbekistan",4
        )
        questions.add(quest12)

        return questions
    }
}