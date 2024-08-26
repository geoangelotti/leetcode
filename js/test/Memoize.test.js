const { expect, test } = require("@jest/globals");
const memoize = require("../src/Memoize");

test("case 1", () => {
	let callCount = 0;
	const sum = (a, b) => {
		callCount += 1;
		return a + b;
	};
	const memoizedSum = memoize(sum);
	expect(memoizedSum(2, 2)).toStrictEqual(4);
	expect(callCount).toStrictEqual(1);
	expect(memoizedSum(2, 2)).toStrictEqual(4);
	expect(callCount).toStrictEqual(1);
	expect(memoizedSum(1, 2)).toStrictEqual(3);
	expect(callCount).toStrictEqual(2);
});

test("case 2", () => {
	let callCount = 0;
	const factorial = (n) => {
		if (n <= 1) {
			callCount += 1;
			return 1;
		} else {
			return (n * factorial(n - 1));
		}
	};
	const memoFactorial = memoize(factorial);
	expect(memoFactorial(2)).toStrictEqual(2);
	expect(callCount).toStrictEqual(1);
	expect(memoFactorial(3)).toStrictEqual(6);
	expect(callCount).toStrictEqual(2);
	expect(memoFactorial(2)).toStrictEqual(2);
	expect(callCount).toStrictEqual(2);
	expect(memoFactorial(3)).toStrictEqual(6);
	expect(callCount).toStrictEqual(2);
});
