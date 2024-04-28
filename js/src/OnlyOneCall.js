/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function(fn) {
	let first = true;
    return function(...args){
        if (first) {
			first = false;
			return fn(...args);
		}
		return undefined
    }
};

module.exports = once;