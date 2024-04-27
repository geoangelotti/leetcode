const reduce = require('./ArrayReduce');

test("case 1", () => {
	const nums = [1, 2, 3, 4];
	function sum(accum, curr) { return accum + curr; };
	const init = 0;
	expect(reduce(nums, sum, init)).toStrictEqual(10);
});

test("case 2", () => {
	const nums = [1, 2, 3, 4];
	function sum(accum, curr) { return accum + curr * curr; };
	const init = 100;
	expect(reduce(nums, sum, init)).toStrictEqual(130);
});

test("case 3", () => {
	const nums = [];
	function sum(accum, curr) { return 0; };
	const init = 25;
	expect(reduce(nums, sum, init)).toStrictEqual(25);
});