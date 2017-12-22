import expect from 'expect';

import secondSmallest from '../index';

describe('Second Smallest Tests', () => {

  it('Should return first value in single element array', () => {
    const input = Array.of(0);
    expect(secondSmallest(input)).toBe(0);
  });

  it('Should return second smallest in array with two elements', () => {
    const input = Array.of(0, 1);
    expect(secondSmallest(input)).toBe(1);
  });

  it('Should return second smallest in array with multiple elements', () => {
    const input = Array.of(0, 3, 4, 1, 6, 7);
    expect(secondSmallest(input)).toBe(1);
  });

  it('Should return second smallest in array with negative values', () => {
    const input = Array.of(-1, 0, 5, 10, -6, -9, 11);
    expect(secondSmallest(input)).toBe(-6);
  })
});