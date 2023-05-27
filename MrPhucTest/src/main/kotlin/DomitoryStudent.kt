class DomitoryStudent(override val money: Int) : Paymentable {


    override fun makePayment(): Int {
        return money
    }

}