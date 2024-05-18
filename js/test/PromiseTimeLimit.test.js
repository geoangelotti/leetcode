const { expect, test } = require("@jest/globals");
const timeLimit = require("../src/PromiseTimeLimit");

test("case 1", async () => {
	const fn = async (n) => { 
		await new Promise(res => setTimeout(res, 100)); 
		return n * n; 
	};
	try {
		const res = await timeLimit(fn, 50)(5);
	} catch (error) {
		expect(error).toBe("Time Limit Exceeded");
	}
});

test("case 2", async () => {
	const fn = async (n) => { 
		await new Promise(res => setTimeout(res, 100)); 
		return n * n; 
	};
	expect(await timeLimit(fn, 150)(5)).toStrictEqual(25);
});

test("case 3", async () => {
	const fn = async (a, b) => { 
		await new Promise(res => setTimeout(res, 120)); 
		return a + b; 
	};
	expect(await timeLimit(fn, 120)(5, 10)).toStrictEqual(15);
});

test("case 4", async () => {
	const fn = async () => { 
		throw "Error";
	};
	try {
		const res = await timeLimit(fn, 1000)();
	} catch (error) {
		expect(error).toBe("Error");
	}
});