const secondSmallest = (input) => {

  if (input.length == 1) {
    return input[0];
  }

  let smallest;
  let secondSmallest;

  if (input[0] < input[1]) {
    smallest = input[0];
    secondSmallest = input[1];
  } else {
    smallest = input[1];
    secondSmallest = input[0];
  }

  input.slice(2).forEach(element => {
    if (element <= smallest) {
      secondSmallest = smallest;
      smallest = element;
    } else if (element < secondSmallest) {
      secondSmallest = element;
    }
  });

  return secondSmallest;
};

export default secondSmallest;