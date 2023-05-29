import re
operand1 = input("Enter first operand: ")
operand2 = input("Enter second operand: ")
operator = input("Enter operator (+, -, *, /): ")
if re.match(r'^\d+$', operand1) and re.match(r'^\d+$', operand2):
    operand1 = int(operand1)
    operand2 = int(operand2)
    if operator == '+':
        result = operand1 + operand2
    elif operator == '-':
        result = operand1 - operand2
    elif operator == '*':
        result = operand1 * operand2
    elif operator == '/':
        result = operand1 / operand2
    else:
        print("Invalid operator")
        exit()
    print(result)

else:
    if operator == '+':
        result = operand1 + operand2
    elif operator == '-':
        result = operand1.replace(operand2, '')
    elif operator == '*' :
        
        if re.match(r'^\d+$', operand1):
            integer_operand = operand1
            string_operand = operand2
        elif re.match(r'^\d+$', operand2):
            integer_operand = operand2
            string_operand = operand1
        else:
            print("Invalid operand types")
            exit()
       
        if operator == '*':
            result = string_operand * int(integer_operand)
        else:
            string_length = len(string_operand)
            result = [string_operand[i:i+string_length//int(integer_operand)] for i in range(0, len(string_operand), string_length//int(integer_operand))]
            result = '/'.join(result)
    else:
        print("Invalid operator")
        exit()
    print(result)
