/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    return ((BigInt(digits.join(""))+BigInt(1))+"").split("");
};

export default plusOne;