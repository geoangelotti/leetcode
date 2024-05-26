const { expect, test } = require("@jest/globals");
const debounce = require("../src/Debounce");

test("case 1", async () => {
	let start = Date.now();
	function log(...inputs) { 
  		return [Date.now() - start, inputs];
	}
	const dlog = debounce(log, 100);
	await new Promise(resolve => setTimeout(resolve, 50));
	expect(dlog(1)).toBeUndefined();
	await new Promise(resolve => setTimeout(resolve, 75));
	expect(dlog(2)).toBeUndefined();
	await new Promise(resolve => setTimeout(resolve, 100));
});

test("case 2", async () => {
	let start = Date.now();
	function log(...inputs) { 
  		return [Date.now() - start, inputs];
	}
	const dlog = debounce(log, 20);
	await new Promise(resolve => setTimeout(resolve, 50));
	expect(dlog(1)).toBeUndefined();
	await new Promise(resolve => setTimeout(resolve, 100));
	expect(dlog(2)).toBeUndefined();
	await new Promise(resolve => setTimeout(resolve, 100));
});

test("case 3", async () => {
	let start = Date.now();
	function log(...inputs) { 
  		return [Date.now() - start, inputs];
	}
	const dlog = debounce(log, 150);
	await new Promise(resolve => setTimeout(resolve, 50));
	expect(dlog(1)).toBeUndefined();
	await new Promise(resolve => setTimeout(resolve, 300));
	expect(dlog(2)).toBeUndefined();
	await new Promise(resolve => setTimeout(resolve, 300));
	expect(dlog(2)).toBeUndefined();
	await new Promise(resolve => setTimeout(resolve, 150));
});