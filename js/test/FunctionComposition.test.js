const compose = require("../src/FunctionComposition");

test("case 1", () => {
    const functions = [x => x + 1, x => x * x, x => 2 * x];
    const x = 4;
    const composed = compose(functions);
    expect(composed(x)).toStrictEqual(65);
});

test("case 2", () => {
    const functions = [x => 10 * x, x => 10 * x, x => 10 * x];
    const x = 1;
    const composed = compose(functions);
    expect(composed(x)).toStrictEqual(1000);
});

test("case 3", () => {
    const functions = [];
    const x = 42;
    const composed = compose(functions);
    expect(composed(x)).toStrictEqual(42);
});