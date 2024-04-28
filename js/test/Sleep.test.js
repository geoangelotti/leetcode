const sleep = require("../src/Sleep");

test("case 1", async () => {
	const t = Date.now();
	const input = 100;
	expect(await sleep(input).then(() => Date.now() - t - input)).toBeLessThanOrEqual(3);
});

test("case 2", async () => {
	let t = Date.now();
	const input = 200;
	expect(await sleep(input).then(() => Date.now() - t - input)).toBeLessThanOrEqual(3);
});