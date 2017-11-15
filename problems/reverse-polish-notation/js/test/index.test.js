import expect from 'expect';

import evaluate from '../index';

describe('Reverse Polish Notation Evaluation Tests', () => {

  it('Should evaluate expression with single operator', () => {

    const expression = '8 7 *';
    const result = evaluate(expression);

    expect(result).toBe(56);
  });

  it('Should evaluate expression with multiple operators', () => {

    const expression = '8 7 * 1 -';
    const result = evaluate(expression);

    expect(result).toBe(55);
  });

  it('Should evaluate expression with unary operator', () => {

    const expression = '8 7 * 5 ++ -';
    const result = evaluate(expression);

    expect(result).toBe(50);
  });
});