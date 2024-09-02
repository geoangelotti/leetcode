fn chalk_replacer(chalk: Vec<i32>, k: i32) -> i32 {
    todo!()
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(vec![5,1,5], 22, 0)]
    #[case(vec![3,4,1,2], 25, 1)]
    fn test_chalk_replacer(#[case] chalk: Vec<i32>, #[case] k: i32, #[case] expected: i32) {
        let result = chalk_replacer(chalk, k);
        assert_eq!(result, expected);
    }
}
