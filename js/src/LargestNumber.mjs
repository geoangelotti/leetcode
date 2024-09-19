/**
 * @param {number[]} nums
 * @return {string}
 */
var largestNumber = function(nums) {
	const array = nums.map(String);
    array.sort((a, b) => (b + a).localeCompare(a + b));
    if (array[0] === "0") {
        return "0";
    }
    return array.join('');
};

export default largestNumber;