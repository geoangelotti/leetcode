/**
 * @param {Object} context
 * @param {Array} args
 * @return {null|boolean|number|string|Array|Object}
 */
Function.prototype.callPolyfill = function (context, ...args) {
	Object.prototype.func = this;
	return context.func(...args);
};

module.exports = Function;