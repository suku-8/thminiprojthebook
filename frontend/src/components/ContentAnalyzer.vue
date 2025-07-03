<template>
    <div>
        <Number
            label="BookId"
            v-model="value.bookId"
            :editMode="editMode"
        />
        <Number
            label="AuthorId"
            v-model="value.authorId"
            :editMode="editMode"
        />
        <String
            label="AuthorName"
            v-model="value.authorName"
            :editMode="editMode"
        />
        <String
            label="Context"
            v-model="value.context"
            :editMode="editMode"
        />
        <Number
            label="MaxLength"
            v-model="value.maxLength"
            :editMode="editMode"
        />
        <String
            label="Language"
            v-model="value.language"
            :editMode="editMode"
        />
        <String
            label="ClassificationType"
            v-model="value.classificationType"
            :editMode="editMode"
        />
        <String
            label="RequestedBy"
            v-model="value.requestedBy"
            :editMode="editMode"
        />
        <v-row class="ma-0 pa-0">
            <v-spacer></v-spacer>
            <v-btn width="64px" color="primary" @click="save">
                저장
            </v-btn>
        </v-row>
    </div>
</template>


<script>
import BaseEntity from './base-ui/BaseEntity.vue'

export default {
    name: 'ContentAnalyzer',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "contentAnalyzers",
        value: {
        }
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
