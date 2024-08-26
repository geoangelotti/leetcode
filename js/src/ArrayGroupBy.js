/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function (fn) {
    let result = {};
    this.forEach((i) => {
        const r = fn(i);
        if (result[r]) {
            result[r].push(i);
        }
        else {
            result[r] = [i];
        }
    })
    return result;
};

module.exports = Array;