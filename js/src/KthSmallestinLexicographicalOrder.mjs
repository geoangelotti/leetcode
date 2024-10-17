import lexicalOrder from "./LexicographicalNumbers.mjs";
/**
 * @param {number} n
 * @param {number} k
 * @return {number}
 */
var findKthNumber = function (n, k) {
  const lexical = lexicalOrder(n);
  return lexical[k - 1];
};

export default findKthNumber;
