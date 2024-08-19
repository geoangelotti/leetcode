#![allow(dead_code)]
pub fn nth_ugly_number(n: i32) -> i32 {
    todo!()
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(10, 12)]
    #[case(1, 1)]
    fn test_nth_ugly_number(#[case] n: i32, #[case] expected: i32) {
        let result = nth_ugly_number(n);
        assert_eq!(result, expected);
    }
}
