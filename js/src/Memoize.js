/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
	const c = {};
    return function(...args) {
        const key = JSON.stringify(args);
        if (key in c) {
            return c[key];
        }
        const result = fn.apply(this, args);
        c[key] = result;    
        return result;
    }
}

module.exports = memoize;
