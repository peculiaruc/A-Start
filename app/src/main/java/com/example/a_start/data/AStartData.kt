package com.example.a_start.data

import com.example.a_start.R

data class AStartData(
    val imageMain: Int,
    val title: String,
    val varCircleImage: Int,
    val text:String,
    val number: Int,
    val days: String,
    val share:Int,
    val morevert:Int
)


val aStartDataList: List<AStartData> = listOf(
    AStartData(R.drawable.eat,"Our 20 Most Popular Recipes of 2024",R.drawable.eat,"EatingWell",1,"d",R.drawable.share,R.drawable.morevert),
    AStartData(R.drawable.gemi,"Learn Code Repeat  Eat",R.drawable.gemi,"Coding",2,"d",R.drawable.share,R.drawable.morevert),
    AStartData(R.drawable.agile,"Agile Champion, Do it Again",R.drawable.agile,"Agile",3,"d",R.drawable.share,R.drawable.morevert),
    AStartData(R.drawable.alc,"Andela Learning Community",R.drawable.alc,"ALC",4,"d",R.drawable.share,R.drawable.morevert),
    AStartData(R.drawable.adui,"Friend I want you to know am coding Again",R.drawable.adui,"Reawaken",5,"d",R.drawable.share,R.drawable.morevert),
    AStartData(R.drawable.eat,"Our 20 Most Popular Recipes of 2024",R.drawable.eat,"EatingWell",1,"d",R.drawable.share,R.drawable.morevert),
    AStartData(R.drawable.gemi,"Learn Code Repeat Eat ",R.drawable.gemi,"Coding",2,"d",R.drawable.share,R.drawable.morevert),
    AStartData(R.drawable.agile,"Agile Champion, Do it Again",R.drawable.agile,"Agile",3,"d",R.drawable.share,R.drawable.morevert),
    AStartData(R.drawable.alc,"Andela Learning Community",R.drawable.alc,"ALC",4,"d",R.drawable.share,R.drawable.morevert),
    AStartData(R.drawable.adui,"Friend, I want you to know am coding Again",R.drawable.adui,"Reawaken",5,"d",R.drawable.share,R.drawable.morevert),

    )


