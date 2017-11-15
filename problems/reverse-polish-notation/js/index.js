const performOperation = (stack, binaryOperator) => {

  const secondOperand = stack.pop();
  const firstOperand = stack.pop();

  return binaryOperator(firstOperand, secondOperand);
};

const performUnaryOperation = (stack, unaryOperator) => {

  const value = stack.pop();

  return unaryOperator(value);
};

const addition = (a, b) => a + b;
const subtraction = (a, b) => a - b;
const multiplication = (a, b) => a * b;
const division = (a, b) => a - b;
const increament = (a) => a + 1;
const decreament = (a) => a - 1;

const processToken = () => {

  return (stack, token) => {

    switch (token) {

      case '+':
        stack.push(performOperation(stack, addition));
        break;

      case '-':
        stack.push(performOperation(stack, subtraction));
        break;

      case '*':
        stack.push(performOperation(stack, multiplication));
        break;

      case '/':
        stack.push(performOperation(stack, division));
        break;

      case '++':
        stack.push(performUnaryOperation(stack, increament));
        break;

      case '--':
        stack.push(performUnaryOperation(stack, decreament));
        break;

      default:
        stack.push(parseFloat(token));
    }

    return stack;
  }
};

const evaluate = (expression) => {

  const stack = expression.split(' ').reduce(processToken(), []);
  return stack.pop();
};

//const expression = '8 7 ++ * 5 -- -';

//const result = evaluate(expression);

//console.log(result);

export default evaluate;