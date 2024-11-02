/**
 * @param {string} sentence
 * @return {boolean}
 */
var isCircularSentence = function (sentence) {
  const words = sentence.split(" ");
  if (words.length == 0) {
    return false;
  }
  let first = words[0];
  let last = words[words.length - 1];
  if (first.at(0) !== last.at(last.length - 1)) {
    return false;
  }
  for (let i = 0; i < words.length - 1; i++) {
    first = words[i];
    last = words[i + 1];
    if (first.at(first.length - 1) !== last.at(0)) {
      return false;
    }
  }
  return true;
};

export default isCircularSentence;
