public class CreditPaymentService {
    public float calculate(int creditAmount, int creditTime, float annualPercent){
        float monthlyPercent = annualPercent/100/12;                            //вспомогательная переменная, месячная процентная ставка
        float auxCoefficient = (float) Math.pow(1+monthlyPercent, creditTime);  //вспомогательная переменная для облегчения читабельности формулы
        float monthlyPayment = creditAmount*(monthlyPercent*auxCoefficient/(auxCoefficient-1));

        return monthlyPayment;
    }
}
