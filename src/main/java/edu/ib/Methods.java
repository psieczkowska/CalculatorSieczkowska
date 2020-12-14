package edu.ib;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Methods {
    private static double number1;
    private static double result;
    private static String number2 = "";
    private static String sign;
    private static boolean isDot = false;
    private static boolean isSet = false;
    private static boolean isResult = false;

    public Methods() {
    }

    void onAdditionClick(TextField display) {
        String displayText = display.getText();
        double number = Double.parseDouble(displayText);
        number1 = number;
        sign = "+";
        isSet = true;
        isDot = false;
        display.setText("");

    }

    void onChangeSignClick(TextField display) {
        String[] displayText = display.getText().split("");
        if (Double.parseDouble(display.getText()) != 0) {
            if (displayText[0].equals("-")) {
                String numberSign = "";
                for (int i = 1; i < displayText.length; i++) {
                    numberSign += displayText[i];
                }
                display.setText(numberSign);
            } else {
                display.setText("-" + display.getText());
            }
        }
    }

    void onClearClick(TextField display) {
        number1 = 0;
        number2 = "";
        isSet = false;
        isDot = false;
        isResult = false;
        result = 0;
        sign = "";
        display.setText("");
    }

    void onDivideClick(TextField display) {
        String displayText = display.getText();
        double number = Double.parseDouble(displayText);
        number1 = number;
        sign = "/";
        isSet = true;
        isDot = false;
        display.setText("");
    }

    void onDotClick(TextField display) {
        String oldValue = display.getText();
        String set = ".";
        if (isDot == false) {
            if (isSet == false) {
                if (oldValue == null || oldValue.length() == 0) {

                } else {
                    display.setText(oldValue + set);
                    isDot = true;
                }

            } else {
                if (oldValue != null && oldValue.length() != 0) {
                    number2 = oldValue + set;
                    display.setText(oldValue + set);
                    isDot = true;
                }

            }
        }
    }


    void onEightClick(TextField display) {
        String oldValue = display.getText();
        String set = "8";
        if (isSet == false) {
            if (oldValue == null || oldValue.length() == 0) {
                display.setText(set);
            } else {
                display.setText(oldValue + set);
            }

        } else {
            if (oldValue == null || oldValue.length() == 0) {
                number2 = set;
                display.setText(set);
            } else {
                number2 = oldValue + set;
                display.setText(oldValue + set);
            }

        }
    }

    void onEqualClick(TextField display) {
        switch (sign) {
            case "/":
                result = number1 / Double.parseDouble(number2);
                break;
            case "*":
                result = number1 * Double.parseDouble(number2);
                break;
            case "+":
                result = number1 + Double.parseDouble(number2);
                break;
            case "-":
                result = number1 - Double.parseDouble(number2);
                break;
        }
        display.setText(Double.toString(result));
        number1 = result;
        isResult = true;
        isDot = true;
    }


    void onFiveClick(TextField display) {
        String oldValue = display.getText();
        String set = "5";
        if (isSet == false) {
            if (oldValue == null || oldValue.length() == 0) {
                display.setText(set);
            } else {
                display.setText(oldValue + set);
            }

        } else {
            if (oldValue == null || oldValue.length() == 0) {
                number2 = set;
                display.setText(set);
            } else {
                number2 = oldValue + set;
                display.setText(oldValue + set);
            }

        }

    }

    void onFourClick(TextField display) {
        String oldValue = display.getText();
        String set = "4";
        if (isSet == false) {
            if (oldValue == null || oldValue.length() == 0) {
                display.setText(set);
            } else {
                display.setText(oldValue + set);
            }

        } else {
            if (oldValue == null || oldValue.length() == 0) {
                number2 = set;
                display.setText(set);
            } else {
                number2 = oldValue + set;
                display.setText(oldValue + set);
            }

        }
    }

    void onMultiplyClick(TextField display) {
        String displayText = display.getText();
        double number = Double.parseDouble(displayText);
        number1 = number;
        isSet = true;
        isDot = false;
        sign = "*";
        display.setText("");
    }


    void onNineClick(TextField display) {
        String oldValue = display.getText();
        String set = "9";
        if (isSet == false) {
            if (oldValue == null || oldValue.length() == 0) {
                display.setText(set);
            } else {
                display.setText(oldValue + set);
            }

        } else {
            if (oldValue == null || oldValue.length() == 0) {
                number2 = set;
                display.setText(set);
            } else {
                number2 = oldValue + set;
                display.setText(oldValue + set);
            }

        }
    }

    void onOneClick(TextField display) {
        String oldValue = display.getText();
        String set = "1";
        if (isSet == false) {
            if (oldValue == null || oldValue.length() == 0) {
                display.setText(set);
            } else {
                display.setText(oldValue + set);
            }

        } else {
            if (oldValue == null || oldValue.length() == 0) {
                number2 = set;
                display.setText(set);
            } else {
                number2 = oldValue + set;
                display.setText(oldValue + set);
            }

        }

    }

    void onPercentClick(TextField display) {
        if (isSet == false) {
            String oldValue = display.getText();
            display.setText(Double.toString(Double.parseDouble(oldValue) / 100));
        }
        if (isResult == true) {
            display.setText(Double.toString(result / 100));
        }
    }

    void onSevenClick(TextField display) {
        String oldValue = display.getText();
        String set = "7";
        if (isSet == false) {
            if (oldValue == null || oldValue.length() == 0) {
                display.setText(set);
            } else {
                display.setText(oldValue + set);
            }

        } else {
            if (oldValue == null || oldValue.length() == 0) {
                number2 = set;
                display.setText(set);
            } else {
                number2 = oldValue + set;
                display.setText(oldValue + set);
            }

        }

    }


    void onSixClick(TextField display) {
        String oldValue = display.getText();
        String set = "6";
        if (isSet == false) {
            if (oldValue == null || oldValue.length() == 0) {
                display.setText(set);
            } else {
                display.setText(oldValue + set);
            }

        } else {
            if (oldValue == null || oldValue.length() == 0) {
                number2 = set;
                display.setText(set);
            } else {
                number2 = oldValue + set;
                display.setText(oldValue + set);
            }

        }

    }

    void onSubstractClick(TextField display) {
        String displayText = display.getText();
        double number = Double.parseDouble(displayText);
        number1 = number;
        isSet = true;
        isDot = false;
        sign = "-";
        display.setText("");
    }

    void onThreeClick(TextField display) {
        String oldValue = display.getText();
        String set = "3";
        if (isSet == false) {
            if (oldValue == null || oldValue.length() == 0) {
                display.setText(set);
            } else {
                display.setText(oldValue + set);
            }

        } else {
            if (oldValue == null || oldValue.length() == 0) {
                number2 = set;
                display.setText(set);
            } else {
                number2 = oldValue + set;
                display.setText(oldValue + set);
            }

        }

    }

    void onTwoClick(TextField display) {
        String oldValue = display.getText();
        String set = "2";
        if (isSet == false) {
            if (oldValue == null || oldValue.length() == 0) {
                display.setText(set);
            } else {
                display.setText(oldValue + set);
            }

        } else {
            if (oldValue == null || oldValue.length() == 0) {
                number2 = set;
                display.setText(set);
            } else {
                number2 = oldValue + set;
                display.setText(oldValue + set);
            }

        }

    }

    void onZeroClick(TextField display) {
        String oldValue = display.getText();
        String set = "0";
        String[] displayText = display.getText().split("");
        if (!displayText[0].equals("0") || isDot == true) {

            if (isSet == false) {
                if (oldValue == null || oldValue.length() == 0) {
                    display.setText(set);
                } else {
                    display.setText(oldValue + set);
                }

            } else {
                if (oldValue == null || oldValue.length() == 0) {
                    number2 = set;
                    display.setText(set);
                } else {
                    number2 = oldValue + set;
                    display.setText(oldValue + set);
                }

            }
        }
    }
}

