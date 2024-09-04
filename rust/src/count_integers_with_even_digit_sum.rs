pub fn count_even(num: i32) -> i32 {
    todo!()
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(4, 2)]
    #[case(30, 14)]
    fn test_count_even(#[case] num: i32, #[case] expected: i32) {
        let result = count_even(num);
        assert_eq!(result, expected);
    }
}
