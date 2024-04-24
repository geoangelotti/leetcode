/**
 * @param { number[] } nums
 * @return { void}
 */
var ArrayWrapper = function (nums) {
	this.nums = nums;
};

/**
 * @return {number}
 */
ArrayWrapper.prototype.valueOf = function () {
	return this.nums.reduce((acc, c) => acc + Number(c), 0);
};

/**
 * @return {string}
 */
ArrayWrapper.prototype.toString = function () {
	return "[" + this.nums.join(",") + "]";
};

module.exports = ArrayWrapper;