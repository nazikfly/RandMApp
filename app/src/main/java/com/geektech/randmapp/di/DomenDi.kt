import com.geektech.domain.domain.use_case.GetCharacterUseCase
import com.geektech.domain.domain.use_case.GetCharactersUseCase
import org.koin.dsl.module

val domainModule = module {

    factory<GetCharacterUseCase> {
        GetCharacterUseCase(repository = get())
    }
    factory {
        GetCharactersUseCase(repository = get())
    }
}