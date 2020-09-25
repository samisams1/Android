package com.example.roseantevd.models

data class Pin1(var title :String, var amount:Number, var Status:String)

object  Supplier {
    val pins = listOf<Pin1>(

        Pin1("558 585 548 585 545",5,"Active"),
        Pin1("475 458 789 565 458",10,"Active"),
        Pin1("455 666 669 995 111",25,"Active"),
        Pin1("587 478 956 258 954",50,"Active"),
        Pin1("563 258 968 255 147",100,"Active")
    )
}