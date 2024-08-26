/**
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
var timeLimit = function (fn, t) {
    return async function (...args) {
        const originalPromise = fn(...args);
        const rejectPromise = new Promise((_resolve, reject) => {
            setTimeout(() => { reject("Time Limit Exceeded") }, t);
        });
        return Promise.race([originalPromise, rejectPromise]);
    };
};

module.exports = timeLimit;