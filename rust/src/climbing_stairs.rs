#![allow(dead_code)]

fn climb_stairs(n: i32) -> i32 {
    let (mut a, mut b) = (1, 1);
    for _ in 0..(n - 1) {
        let c = a;
        a = a + b;
        b = c;
    }
    a
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(2, 2)]
    #[case(3, 3)]
    fn test_climb_stairs(#[case] n: i32, #[case] expected: i32) {
        let result = climb_stairs(n);
        assert_eq!(result, expected)
    }
}
