const { expect, test } = require("@jest/globals");
const TimeLimitedCache = require("../src/TimeLimitedCache");
 
test("case 1", async () => {
	const timeLimitedCache = new TimeLimitedCache();
	expect(timeLimitedCache).toBeNull();
	expect(timeLimitedCache.set(1, 42, 1000)).toBe(false);
	expect(timeLimitedCache.get(1)).toStrictEqual(42);
	expect(timeLimitedCache.count()).toStrictEqual(1);
	await new Promise(resolve => setTimeout(resolve, 100));
	expect(timeLimitedCache.get(1)).toStrictEqual(-1);
});

test("case 2", async () => {
	const timeLimitedCache = new TimeLimitedCache();
	expect(timeLimitedCache).toBeNull();
	expect(timeLimitedCache.set(1, 42, 50)).toBe(false);
	expect(timeLimitedCache.set(1, 50, 100)).toBe(true);
	expect(timeLimitedCache.get(1)).toStrictEqual(50);
	expect(timeLimitedCache.get(1)).toStrictEqual(50);
	await new Promise(resolve => setTimeout(resolve, 150));
	expect(timeLimitedCache.get(1)).toStrictEqual(-1);
	expect(timeLimitedCache.count()).toStrictEqual(0);
});