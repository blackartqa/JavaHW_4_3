public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        //int creditAmount          сумма кредита в рублях
        //int creditTime            срок кредитования в месяцах
        //float annualPercent       годовая процентная ставка

        float monthlyPaymentOneYear = service.calculate(1_000_000, 12, 9.99F);
        System.out.printf("Ежемесячный платёж при сроке кредитования 1 год равен %.2f \n", monthlyPaymentOneYear);

        float monthlyPaymentTwoYear = service.calculate(1_000_000, 24, 9.99F);
        System.out.printf("Ежемесячный платёж при сроке кредитования 2 года равен %.2f \n", monthlyPaymentTwoYear);

        float monthlyPaymentThreeYear = service.calculate(1_000_000, 36, 9.99F);
        System.out.printf("Ежемесячный платёж при сроке кредитования 3 года равен %.2f \n", monthlyPaymentThreeYear);
    }
}
