
/**
 * Write a description of class BankGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//import 
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
public class BankGUI implements ActionListener
{
    // Declear all the components here
    private JFrame Frame;
    
    // ----Debit Card components
    private JLabel debitCardIDLabel,issuerBankLabel,balanceAmountLabel,PINnumberLabel,clientNameLabel,bankAccountLabel,
    wdCardIDLabel,wdWithdrawalAmountLabel,wdPINnumberLabel,wdWithdrawalDateLabel;

    private JButton addDebitCardButton,wdDisplayButton,wdWithdrawButton;

    private JTextField debitCardIDTxt,issuerBankTxt,balanceAmountTxt,PINnumberTxt,clientNameTxt,bankAccountTxt,wdCardIDTxt,
    wdWithdrawalAmountTxt,wdPINnumberTxt;

    private JComboBox<String> wdWithdrawalDateBox,wdWithdrawalDateDayBox,wdWithdrawalDateMonthBox,wdWithdrawalDateYearBox;

    // ----Credit Card components
    private JLabel creditCardIDLabel,creditClientNameLabel,creditIssuerBankLabel,creditCVCnumberLabel,creditBalanceAmountLabel,
    creditBankAccountLabel,creditInterestRateLabel,creditExpirationDateLabel,clCardIDLabel,clCreditLimitLabel,
    clGracePeriodLabel;

    private JButton cancelCreditCardButton,addCreditCardButton,clDisplayButton,clSetCreditLimitButton,clClearButton;

    private JTextField creditCardIDTxt,creditClientNameTxt,creditIssuerBankTxt,creditCVCnumberTxt,creditBalanceAmountTxt,
    creditBankAccountTxt,creditInterestRateTxt,clCardIDTxt,clCreditLimitTxt,clGracePeriodTxt;

    private JComboBox<String> creditDayExpirationDateBox,creditMonthExpirationDateBox,creditYearExpirationDateBox;

    // ArrayList<BankCard> cards;
    ArrayList<BankCard> BankCardArrayList = new ArrayList <BankCard>();

    // Instance variables for DebitCard and CreditCard objects
    DebitCard debitobject;
    CreditCard creditobject;
    // Constructor
    public BankGUI(){
        Frame = new JFrame();
        
        // Creating DebitCard Labels,Textfields and Buttons

        debitCardIDLabel = new JLabel("Card ID:");
        issuerBankLabel = new JLabel("Issuer Bank:");
        balanceAmountLabel = new JLabel("Balance Amount:");
        PINnumberLabel = new JLabel("PIN Number:");
        clientNameLabel = new JLabel("CLient Name:");
        bankAccountLabel = new JLabel("Bank Account:");
        addDebitCardButton = new JButton("Add Debit Card");

        debitCardIDTxt = new JTextField();
        issuerBankTxt = new JTextField();
        balanceAmountTxt = new JTextField();
        PINnumberTxt = new JTextField();
        clientNameTxt = new JTextField();
        bankAccountTxt = new JTextField();
        
        // Setting the bounds for Label, TextField and Button
        debitCardIDLabel.setBounds(63, 91, 60, 20);
        debitCardIDTxt.setBounds(123, 85, 90, 32);
        issuerBankLabel.setBounds(262, 91, 86, 20);
        issuerBankTxt.setBounds(348, 85, 140, 32);
        balanceAmountLabel.setBounds(543, 91, 114, 20);
        balanceAmountTxt.setBounds(657, 85, 140, 32);
        PINnumberLabel.setBounds(34, 144, 89, 20);
        PINnumberTxt.setBounds(123, 138, 90, 32);
        clientNameLabel.setBounds(259, 144, 89, 20);
        clientNameTxt.setBounds(348, 138, 140, 32);
        bankAccountLabel.setBounds(560, 144, 97, 20);
        bankAccountTxt.setBounds(657, 138, 140, 32);
        addDebitCardButton.setBounds(348, 209, 130, 32);
        
        // Adding The labels, TextFields and Buttons to frame
        Frame.add(debitCardIDLabel);
        Frame.add(debitCardIDTxt);
        Frame.add(issuerBankLabel);
        Frame.add(issuerBankTxt);
        Frame.add(balanceAmountLabel);
        Frame.add(balanceAmountTxt);
        Frame.add(PINnumberLabel);
        Frame.add(PINnumberTxt);
        Frame.add(clientNameLabel);
        Frame.add(clientNameTxt);
        Frame.add(bankAccountLabel);
        Frame.add(bankAccountTxt);
        Frame.add(addDebitCardButton);
        
        // Creating Withdraw Labels, TextFileds, ComboBox and Buttons
        creditCardIDLabel = new JLabel("Card ID");
        creditClientNameLabel = new JLabel("Client Name");
        creditIssuerBankLabel = new JLabel("Issuer Bank");
        creditCVCnumberLabel = new JLabel("CVC Number");
        creditBalanceAmountLabel = new JLabel("Balance Amount");
        creditBankAccountLabel = new JLabel("Bank Account");
        creditInterestRateLabel = new JLabel("Interest Rate");
        creditExpirationDateLabel = new JLabel("Expiration date");
        cancelCreditCardButton = new JButton("Cancel Credit Card");
        addCreditCardButton = new JButton("Add Credit Card");

        creditCardIDTxt = new JTextField();
        creditClientNameTxt = new JTextField();
        creditIssuerBankTxt = new JTextField();
        creditCVCnumberTxt = new JTextField();
        creditBalanceAmountTxt = new JTextField();
        creditBankAccountTxt = new JTextField();
        creditInterestRateTxt = new JTextField();

        String[] dayList = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22",
                "23","24","25","26","27","28","29","30","31"};
        creditDayExpirationDateBox = new JComboBox<>(dayList);

        String[] monthList = {"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
        creditMonthExpirationDateBox = new JComboBox<>(monthList);

        String[] yearList = {"2000","2001","2002","2003","2004","2005","2006"};
        creditYearExpirationDateBox = new JComboBox<>(yearList);

        creditCardIDLabel.setBounds(63, 292, 60, 20);
        creditCardIDTxt.setBounds(123, 286, 90, 32);
        creditClientNameLabel.setBounds(259, 292, 89, 20);
        creditClientNameTxt.setBounds(348, 286, 140, 32);
        creditIssuerBankLabel.setBounds(566, 292, 86, 20);
        creditIssuerBankTxt.setBounds(652, 286, 140, 32);
        creditCVCnumberLabel.setBounds(28, 343, 95, 20);
        creditCVCnumberTxt.setBounds(123, 337, 90, 32);
        creditBalanceAmountLabel.setBounds(234, 342, 114, 20);
        creditBalanceAmountTxt.setBounds(348, 336, 140, 32);
        creditBankAccountLabel.setBounds(555, 342, 97, 20);
        creditBankAccountTxt.setBounds(652, 336, 140, 32);
        creditInterestRateLabel.setBounds(31, 393, 92, 20);
        creditInterestRateTxt.setBounds(123, 387, 90, 32);
        creditExpirationDateLabel.setBounds(244, 392, 104, 20);
        creditDayExpirationDateBox.setBounds(348, 386, 70, 32);
        creditMonthExpirationDateBox.setBounds(425, 386, 70, 32);
        creditYearExpirationDateBox.setBounds(502, 386, 80, 32);
        cancelCreditCardButton.setBounds(226, 459, 150, 32);
        addCreditCardButton.setBounds(446, 459, 130, 32);
        
        // Adding the Labels, Textfields and Buttons to Frame
        Frame.add(creditCardIDLabel);
        Frame.add(creditCardIDTxt);
        Frame.add(creditClientNameLabel);
        Frame.add(creditClientNameTxt);
        Frame.add(creditIssuerBankLabel);
        Frame.add(creditIssuerBankTxt);
        Frame.add(creditCVCnumberLabel);
        Frame.add(creditCVCnumberTxt);
        Frame.add(creditBalanceAmountLabel);
        Frame.add(creditBalanceAmountTxt);
        Frame.add(creditBankAccountLabel);
        Frame.add(creditBankAccountTxt);
        Frame.add(creditInterestRateLabel);
        Frame.add(creditInterestRateTxt);
        Frame.add(creditExpirationDateLabel);
        Frame.add(creditDayExpirationDateBox);
        Frame.add(creditMonthExpirationDateBox);
        Frame.add(creditYearExpirationDateBox);
        Frame.add(cancelCreditCardButton);
        Frame.add(addCreditCardButton);

        wdCardIDLabel = new JLabel("Card ID");
        wdWithdrawalAmountLabel = new JLabel("Withdrawal Amount");
        wdPINnumberLabel = new JLabel("PIN Number");
        wdWithdrawalDateLabel = new JLabel("Withdrawal Date");

        wdDisplayButton = new JButton("Display Button");
        wdWithdrawButton = new JButton("WithDraw Button");

        wdCardIDTxt = new JTextField();
        wdWithdrawalAmountTxt = new JTextField();
        wdPINnumberTxt = new JTextField();

        String[] DayList = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22",
                "23","24","25","26","27","28","29","30","31"};
        wdWithdrawalDateDayBox = new JComboBox<>(DayList);

        String[] MonthList = {"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
        wdWithdrawalDateMonthBox = new JComboBox<>(MonthList);

        String[] YearList = {"2000","2001","2002","2003","2004","2005","2006"};
        wdWithdrawalDateYearBox = new JComboBox<>(YearList);

        wdCardIDLabel.setBounds(63, 540, 60, 20);
        wdCardIDTxt.setBounds(123, 540, 90, 32);
        wdWithdrawalAmountLabel.setBounds(376, 536, 132, 20);
        wdWithdrawalAmountTxt.setBounds(508, 530, 140, 32);
        wdPINnumberLabel.setBounds(34, 585, 89, 20);
        wdPINnumberTxt.setBounds(123, 579, 90, 32);
        wdWithdrawalDateLabel.setBounds(392, 586, 110, 20);
        wdWithdrawalDateDayBox.setBounds(508, 578, 70, 32);
        wdWithdrawalDateMonthBox.setBounds(590, 578, 70, 32);
        wdWithdrawalDateYearBox.setBounds(672, 578, 80, 32);
        wdDisplayButton.setBounds(253, 646, 120, 32);
        wdWithdrawButton.setBounds(447, 646, 130, 32);

        Frame.add(wdCardIDLabel);
        Frame.add(wdCardIDTxt);
        Frame.add(wdWithdrawalAmountLabel);
        Frame.add(wdWithdrawalAmountTxt);
        Frame.add(wdPINnumberLabel);
        Frame.add(wdPINnumberTxt);
        Frame.add(wdWithdrawalDateLabel);
        Frame.add(wdWithdrawalDateDayBox);
        Frame.add(wdWithdrawalDateMonthBox);
        Frame.add(wdWithdrawalDateYearBox);
        Frame.add(wdDisplayButton);
        Frame.add(wdWithdrawButton);
        
        clCardIDLabel = new JLabel("CardID :");
        clCreditLimitLabel = new JLabel("Credit Limit :");
        clGracePeriodLabel = new JLabel("Grace Period :");
        clDisplayButton = new JButton("Display");
        clSetCreditLimitButton = new JButton("Set Credit Limit");
        clClearButton = new JButton("Clear all");

        clCardIDTxt = new JTextField();
        clCreditLimitTxt = new JTextField();
        clGracePeriodTxt = new JTextField();

        clCardIDLabel.setBounds(63, 720, 60, 20);
        clCardIDTxt.setBounds(123, 720, 90, 32);
        clCreditLimitLabel.setBounds(278, 720, 82, 20);
        clCreditLimitTxt.setBounds(360, 720, 114, 32);
        clGracePeriodLabel.setBounds(560, 720, 94, 20);
        clGracePeriodTxt.setBounds(652, 720, 90, 32);
        clDisplayButton.setBounds(194, 800, 120, 32);
        clSetCreditLimitButton.setBounds(354, 800, 150, 32);
        clClearButton.setBounds(550, 800, 120, 32);

        Frame.add(clCardIDLabel);
        Frame.add(clCardIDTxt);
        Frame.add(clCreditLimitLabel);
        Frame.add(clCreditLimitTxt);
        Frame.add(clGracePeriodLabel);
        Frame.add(clGracePeriodTxt);
        Frame.add(clDisplayButton);
        Frame.add(clSetCreditLimitButton);
        Frame.add(clClearButton);

        addDebitCardButton.addActionListener(this);
        wdDisplayButton.addActionListener(this);
        wdWithdrawButton.addActionListener(this);
        cancelCreditCardButton.addActionListener(this);
        addCreditCardButton.addActionListener(this);
        clDisplayButton.addActionListener(this);
        clSetCreditLimitButton.addActionListener(this);
        clClearButton.addActionListener(this);

        addCreditCardButton.setFocusable(false);
        wdDisplayButton.setFocusable(false);
        wdWithdrawButton.setFocusable(false);
        cancelCreditCardButton.setFocusable(false);
        addCreditCardButton.setFocusable(false);
        clDisplayButton.setFocusable(false);
        clSetCreditLimitButton.setFocusable(false);
        clClearButton.setFocusable(false);

        Frame.setSize(850, 950);
        Frame.setLayout(null);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setResizable(false);
        Frame.setVisible(true);
    }
    // Implement the main method of the
    
    // ActionListener
    public void actionPerformed(ActionEvent e){
        //write the logic of the button functionally here
        //add Debit Card
        if(e.getSource() == addDebitCardButton){
            // check whether the text fields are empty or not
            if(clientNameTxt.getText().isEmpty() ||
            debitCardIDTxt.getText().isEmpty() ||
            issuerBankTxt.getText().isEmpty() ||
            bankAccountTxt.getText().isEmpty() ||
            balanceAmountTxt.getText().isEmpty() ||
            PINnumberTxt.getText().isEmpty())
            {
                // optionpane show the message if any field is empty
                JOptionPane.showMessageDialog(Frame, "Please Input All The Info!","Error Found",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                //using try catch method for event handling
                try{
                    double balanceAmount = Double.parseDouble(balanceAmountTxt.getText());
                    int debitCardID = Integer.parseInt(debitCardIDTxt.getText());
                    String bankAccount = bankAccountTxt.getText();
                    String issuerBank = issuerBankTxt.getText();
                    String clientName = clientNameTxt.getText();
                    int PINnumber = Integer.parseInt(PINnumberTxt.getText());
                    String balance = String.valueOf(balanceAmount);
                    String card = String.valueOf(debitCardID);
                    String pin = String.valueOf(PINnumber);
                    String message = "Balance Amount :" + balance + " \nCard ID : " + card + " \nIssuer Bank : " + issuerBank +
                        " \nBank Account : " + bankAccount + " \nClient Name : " + clientName + " \nPin Number : "
                        + pin;
                    debitobject = new DebitCard(balanceAmount,debitCardID,bankAccount,issuerBank,clientName,PINnumber);
                    boolean isCardIDUnique = true;
                    for(BankCard debitobject : BankCardArrayList){
                        if (debitobject instanceof DebitCard){
                            DebitCard card_obj = (DebitCard) debitobject;
                            if(debitobject.getCardId() == debitCardID){
                                isCardIDUnique = false;
                                break;
                            }
                        }
                    }
                    if (!clientName.matches("[a-zA-Z]+")) {
                        JOptionPane.showMessageDialog(null, "Please Input Alphabetic Values for Client Name!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                        return;             
                    }
                    if (!issuerBank.matches("[a-zA-Z]+")) {
                        JOptionPane.showMessageDialog(null, "Please Input Alphabetic Values for Client Name!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (isCardIDUnique){
                        BankCardArrayList.add(debitobject);
                        JOptionPane.showMessageDialog(null, "Debit Card Added Successfully!\n" + message,"Information",
                            JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "The Card ID was already added", "Information",JOptionPane.INFORMATION_MESSAGE);
                    }
                }

                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(Frame, "Invalid Input,Please Check Again","Error Found",
                        JOptionPane.INFORMATION_MESSAGE);

                }
            }
        }

        // after clicking in add debit card button all items of debit card is added on arraylist of bankcard class
        if (e.getSource() == addCreditCardButton) {
            if (creditClientNameTxt.getText().isEmpty() ||
            creditIssuerBankTxt.getText().isEmpty() ||
            creditBankAccountTxt.getText().isEmpty() ||
            creditBalanceAmountTxt.getText().isEmpty() ||
            creditCVCnumberTxt.getText().isEmpty() ||
            creditInterestRateTxt.getText().isEmpty() ||
            creditInterestRateTxt.getText().isEmpty() ||
            creditYearExpirationDateBox.getSelectedItem().equals("Expiration Year") ||
            creditMonthExpirationDateBox.getSelectedItem().equals("Expiration Month") ||
            creditDayExpirationDateBox.getSelectedItem().equals("Expiration Day"))
            {
                JOptionPane.showMessageDialog(Frame, "Please Input All The Details!","Error Found",JOptionPane.INFORMATION_MESSAGE);
            } else {
                try{
                    int creditCardID = Integer.parseInt(creditCardIDTxt.getText());
                    String creditClientName = creditClientNameTxt.getText();
                    String creditIssuerBank = creditIssuerBankTxt.getText();
                    String creditBankAccount = creditBankAccountTxt.getText();
                    int creditBalanceAmount = Integer.parseInt(creditBalanceAmountTxt.getText());
                    int creditCVCnumber = Integer.parseInt(creditCVCnumberTxt.getText());
                    double creditInterestRate = Double.parseDouble(creditInterestRateTxt.getText());
                    String dayList = (String) creditDayExpirationDateBox.getSelectedItem();
                    String monthList = (String) creditMonthExpirationDateBox.getSelectedItem();
                    String yearList = (String) creditYearExpirationDateBox.getSelectedItem();
                    String creditExpirationDate = dayList + "-" + monthList + "-" + yearList;
                    String balanceAmount = String.valueOf(creditBalanceAmount);
                    String cardID = String.valueOf(creditCardID);
                    String CVC = String.valueOf(creditCVCnumber);
                    String interest = String.valueOf(creditInterestRate);
                    String message = "Balance Amount : " + balanceAmount + " \nCard ID : " + creditCardID + " \nIssuerBank : " +
                        creditIssuerBank + " \nBankAccount : " + creditBankAccount + " \nClient Name : " + creditClientName +
                        " \nCVC Number : " + creditCVCnumber + " \nInterest Rate : " + creditInterestRate + "\nExpiration Date : " + dayList + " "+
                        monthList + " "+yearList;

                    creditobject = new CreditCard(creditCardID, creditClientName, creditIssuerBank, creditBankAccount, 
                        creditBalanceAmount, creditCVCnumber, creditInterestRate, creditExpirationDate);
                    boolean isCardIdUnique = true;
                    for (BankCard creditobject : BankCardArrayList) {
                        if (creditobject instanceof CreditCard) {
                            CreditCard card_object = (CreditCard) creditobject;
                            if (creditobject.getCardId() == creditCardID) {
                                isCardIdUnique = false;
                                break;
                            }
                        }
                    }
                    if (!creditClientName.matches("[a-zA-Z]+")) {
                        JOptionPane.showMessageDialog(Frame, "Please Input Alphabetic Values for Client Name!","Error",
                            JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (!creditIssuerBank.matches("[a-zA-Z]+")) {
                        JOptionPane.showMessageDialog(Frame, "Please Input Alphabetic Values for Issuer Bank!","Error",
                            JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (isCardIdUnique) {
                        BankCardArrayList.add(creditobject);
                        JOptionPane.showMessageDialog(Frame, "Credit Card Added Successfully!\n" + message,"Information",
                            JOptionPane.INFORMATION_MESSAGE);

                    }else{
                        JOptionPane.showMessageDialog(Frame, "The Card ID Was Already Added", "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (NumberFormatException x) {
                    JOptionPane.showMessageDialog(Frame, "Please Input Numeric Values","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        // The info of debitCard and withdraw is displayed when display button is clicked
        if(e.getSource() == wdDisplayButton)
        {
            if(debitCardIDTxt.getText().isEmpty() ||
            issuerBankTxt.getText().isEmpty() ||
            clientNameTxt.getText().isEmpty() ||
            bankAccountTxt.getText().isEmpty() ||
            balanceAmountTxt.getText().isEmpty() ||
            wdPINnumberTxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(Frame, "Please Input All The Details!","Error",JOptionPane.ERROR_MESSAGE);
            }

            else{
                try{
                    int cardID = Integer.parseInt(debitCardIDTxt.getText());
                    String issuerBank = issuerBankTxt.getText();
                    int balanceAmt = Integer.parseInt(balanceAmountTxt.getText());
                    String bankAccount = bankAccountTxt.getText();
                    String clientName = clientNameTxt.getText();
                    int pinNumber = Integer.parseInt(wdPINnumberTxt.getText());
                    String balance = String.valueOf(balanceAmt);
                    String card = String.valueOf(cardID);
                    String pin = String.valueOf(pinNumber);

                    debitobject = new DebitCard(balanceAmt, cardID, bankAccount, issuerBank, clientName, pinNumber);
                    for(BankCard debitobject : BankCardArrayList) {
                        if(debitobject instanceof DebitCard) {
                            DebitCard debitdisplayobject = (DebitCard) debitobject;
                            debitdisplayobject.display();
                        }
                    }
                }
                catch(NumberFormatException a) {
                    JOptionPane.showMessageDialog(Frame, "Please input numeric values!","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        // ActionEvent or Button Functionality of withdrawbutton
        if  (e.getSource() == wdWithdrawButton) {
            if (wdCardIDTxt.getText().isEmpty() ||
            wdWithdrawalAmountTxt.getText().isEmpty() ||
            wdWithdrawalDateDayBox.getSelectedItem().equals("Day") ||
            wdWithdrawalDateMonthBox.getSelectedItem().equals("Month") ||
            wdWithdrawalDateYearBox.getSelectedItem().equals("Year") ||
            wdPINnumberTxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Input All The Details!", "Message", JOptionPane.ERROR_MESSAGE);
            }else{
                try{
                    int cardID = Integer.parseInt(wdCardIDTxt.getText());
                    int withdrawalAmount = Integer.parseInt(wdWithdrawalAmountTxt.getText());
                    int pinNumber = Integer.parseInt(wdPINnumberTxt.getText());
                    String DayList = (String) wdWithdrawalDateDayBox.getSelectedItem();
                    String MonthList = (String) wdWithdrawalDateMonthBox.getSelectedItem();
                    String YearList = (String) wdWithdrawalDateYearBox.getSelectedItem();
                    String dateOfWithdrawal = DayList + "-" + MonthList + "-" + YearList;
                    boolean isCardIDFound = false;
                    boolean isPinNumberCorrect = false;
                    for (BankCard bc :  BankCardArrayList) {
                        if (bc instanceof DebitCard && !isCardIDFound) {
                            DebitCard dc = (DebitCard) bc;
                            if (dc.getCardId() == cardID) {
                                isCardIDFound = true;
                                if (dc.getPinNumber() == pinNumber) {
                                    isPinNumberCorrect = true;
                                    if (dc.getBalanceAmount() >= withdrawalAmount) {
                                        dc.withdraw(withdrawalAmount, dateOfWithdrawal, pinNumber);
                                        JOptionPane.showMessageDialog(null, "Withdrawal Successfull","Message",
                                            JOptionPane.INFORMATION_MESSAGE);
                                    }else {
                                        JOptionPane.showMessageDialog(null, "Insufficient Balance!","Message",
                                            JOptionPane.ERROR_MESSAGE);
                                    }
                                    break;
                                } else{
                                    JOptionPane.showMessageDialog(null, "Invalid PIN Number!","Meessage",
                                        JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                            }
                        }
                    }

                    if (!isCardIDFound) {
                        JOptionPane.showMessageDialog(null, "Card Not Found","Message",JOptionPane.ERROR_MESSAGE);

                    }

                } catch(NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid Input! Please Enter Number Only","Message",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        // when cancel credit card is clicked it cancels credit card after valid card id is entered
        if (e.getSource() == cancelCreditCardButton) {
            if(creditCardIDTxt.getText().isEmpty() ||
            creditIssuerBankTxt.getText().isEmpty() ||
            creditBalanceAmountTxt.getText().isEmpty() ||
            creditClientNameTxt.getText().isEmpty() ||
            creditBankAccountTxt.getText().isEmpty() ||
            creditCVCnumberTxt.getText().isEmpty() ||
            creditInterestRateTxt.getText().isEmpty() ||
            creditYearExpirationDateBox.getSelectedItem().equals("Year") ||
            creditMonthExpirationDateBox.getSelectedItem().equals("Month") ||
            creditDayExpirationDateBox.getSelectedItem().equals("Day") ||
            clCreditLimitTxt.getText().isEmpty() ||
            clCardIDTxt.getText().isEmpty() ||
            clGracePeriodTxt.getText().isEmpty())

            {
                JOptionPane.showMessageDialog(Frame, "Please Input All The Details","Error",JOptionPane.ERROR_MESSAGE);
            }

            else{
                try{
                    int cardID = Integer.parseInt(clCardIDTxt.getText());
                    double creditLimit = Double.parseDouble(clCreditLimitTxt.getText());
                    int gracePeriod = Integer.parseInt(clGracePeriodTxt.getText());
                    boolean isCardIDEqual = false;
                    for ( BankCard Credit :  BankCardArrayList) {
                        if (Credit instanceof CreditCard) {
                            CreditCard creditobj = (CreditCard) Credit;
                            if (creditobj.getCardId() == cardID) {
                                creditobj.cancelcreditCard();
                                isCardIDEqual = true;
                                break;
                            }
                        }
                    }
                    if (isCardIDEqual) {
                        JOptionPane.showMessageDialog(Frame, "Credit Card Cancelled Successfully!","Message",JOptionPane.INFORMATION_MESSAGE);
                    } else{
                        JOptionPane.showMessageDialog(Frame, "Card Was Not Found", "Message", JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Frame, "Please Input The Correct Values","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        // ActionEvent or button functionality of set credit limit card 
        if (e.getSource() == clSetCreditLimitButton) {
            if(clCardIDTxt.getText().isEmpty() ||
            clCreditLimitTxt.getText().isEmpty() ||
            clGracePeriodTxt.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(Frame, "Please Input All The Details","Error",JOptionPane.ERROR_MESSAGE);
            } else {
                try{
                    int clCardID = Integer.parseInt(clCardIDTxt.getText());
                    double clCreditLimit = Double.parseDouble(clCreditLimitTxt.getText());
                    int clGracePeriod = Integer.parseInt(clGracePeriodTxt.getText());
                    boolean cardIDFound = false;
                    for (BankCard Credit :  BankCardArrayList) {
                        if (Credit instanceof CreditCard) {
                            CreditCard cards = (CreditCard) Credit;
                            if (cards.getCardId() == clCardID) {
                                cards.setCreditLimit(clCreditLimit, clGracePeriod);
                                cardIDFound = true;
                                break;
                            }
                        }
                    }
                    if(cardIDFound) {
                        JOptionPane.showMessageDialog(Frame, "Credit Limit Set Successfully","Message",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(Frame, "Card Not Found!","Message",JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Frame, "Please Input The Correct Values!");
                }
            }
        }

        // when credit display button is pressed, the info of credicard and setcreditlimit is displayed
        if(e.getSource() == clDisplayButton) {
            if(creditCardIDTxt.getText().isEmpty() ||
            creditIssuerBankTxt.getText().isEmpty() ||
            creditBankAccountTxt.getText().isEmpty() ||
            creditClientNameTxt.getText().isEmpty() ||
            creditBalanceAmountTxt.getText().isEmpty() ||
            creditCVCnumberTxt.getText().isEmpty() ||
            creditInterestRateTxt.getText().isEmpty() ||
            creditYearExpirationDateBox.getSelectedItem().equals("Year") ||
            creditMonthExpirationDateBox.getSelectedItem().equals("Month") ||
            creditDayExpirationDateBox.getSelectedItem().equals("day"))
            {
                JOptionPane.showMessageDialog(Frame, "Please Input All The Information!","Message",JOptionPane.ERROR_MESSAGE);
            }
            else{
                try{
                    int creditCardID = Integer.parseInt(creditCardIDTxt.getText());
                    String creditClientName = creditClientNameTxt.getText();
                    String creditIssuerBank = creditIssuerBankTxt.getText();
                    String creditBankAccount = creditBalanceAmountTxt.getText();
                    int creditBalanceAmount = Integer.parseInt(creditBalanceAmountTxt.getText());
                    int creditCVCnumber = Integer.parseInt(creditCVCnumberTxt.getText());
                    double creditInterestRate = Double.parseDouble(creditInterestRateTxt.getText());
                    String dayList = (String) creditDayExpirationDateBox.getSelectedItem();
                    String monthList = (String) creditMonthExpirationDateBox.getSelectedItem();
                    String yearList = (String) creditYearExpirationDateBox.getSelectedItem();
                    String creditExpirationDate = dayList + "-" + monthList + "-" + yearList;
                    String balanceamount = String.valueOf(creditBalanceAmount);
                    String cardid = String.valueOf(creditCardID);
                    String CVC = String.valueOf(creditCVCnumber);
                    String rate = String.valueOf(creditInterestRate);
                    String message = "Balance Amount: " + balanceamount + "\nCard ID: " + cardid + "\nIssuerBank: " + creditIssuerBank + 
                        "\nBank Account: " + creditBankAccount + "\nClient Name: " + creditClientName + "\nCVC Number: " + CVC + "\nInterest rate: "
                        + rate + "\nExpiration Date :" + dayList + " " + monthList + " " + yearList;
                    creditobject = new CreditCard(creditCardID, creditClientName, creditIssuerBank, creditBankAccount, creditBalanceAmount,
                        creditCVCnumber, creditInterestRate, creditExpirationDate);
                    for (BankCard creditobject : BankCardArrayList) {
                        if (creditobject instanceof CreditCard) {
                            CreditCard creditdisplayobject = (CreditCard) creditobject;
                            creditdisplayobject.display();
                        }
                    }
                }
                catch(NumberFormatException Q) {
                    JOptionPane.showMessageDialog(Frame, "Please input numeric values!","Message",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        // This Clear Buttons Clears All The TextFields
        if(e.getSource() == clClearButton){
            debitCardIDTxt.setText("");
            issuerBankTxt.setText("");
            balanceAmountTxt.setText("");
            PINnumberTxt.setText("");
            clientNameTxt.setText("");
            bankAccountTxt.setText("");
            wdCardIDTxt.setText("");
            wdWithdrawalAmountTxt.setText("");
            wdPINnumberTxt.setText("");
            creditCardIDTxt.setText("");
            creditClientNameTxt.setText("");
            creditIssuerBankTxt.setText("");
            creditCVCnumberTxt.setText("");
            creditBalanceAmountTxt.setText("");
            creditBankAccountTxt.setText("");
            creditInterestRateTxt.setText("");
            clCardIDTxt.setText("");
            clCreditLimitTxt.setText("");
            clGracePeriodTxt.setText("");
        }
    }
    // Main method
    public static void main(String[] args){
        BankGUI obj = new BankGUI(); 
    }
}

